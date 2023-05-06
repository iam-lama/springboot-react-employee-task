import React, { useState,useEffect } from 'react';
// import {data} from './Constants';
import {Card, ExpItem, NewExp}  from './Components';

import './App.css';

const App = () =>{
    const [expenseList, setExpenseList] = useState([]);
    const [isLoading, setIsLoading] = useState(true);
    
    useEffect(() => {   
        fetch('/api/expenses/list-expenses')
        .then(response => response.json())
        .then(data =>{setExpenseList(data);setIsLoading(false);});
    }, [expenseList]);

    const HandleAddNEwExpense = (newAddedItem) =>{
        console.log(newAddedItem)
        fetch('/api/expenses/add_expense', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(newAddedItem)
        });
    }

    return (
        <>
       {!isLoading ?
        <div className="main-container">        
            <Card className="expenses">
                <NewExp onAddExpenses={HandleAddNEwExpense} />
                {expenseList.map((expense,index) =>(
                    <ExpItem
                    title={expense.title} 
                    price={expense.price}
                    Date={expense.date}  key={index}/>
                ))}                 
            </Card>
        </div>:<div>Fetching ...</div>
        }
        </>
    )

}

export default App;