import React, {useState} from "react";
import "./ExpForm.css"

const ExpForm = (props) =>{

    const [expenseTitle, setExpenseTitle] = useState('Enter Expense')
    const [expensePrice, setExpensePrice] = useState('0.0')
    const [expenseDate, setExpenseDate] = useState('')

    const handleTitleChange = (event) =>{
        setExpenseTitle(event.target.value)
    }
    const handlePriceChange = (event) =>{
        setExpensePrice(event.target.value)
    }
    const handleDateChange = (event) =>{
        setExpenseDate(event.target.value)
    }
    const handleSubmit = (event)=>{
        event.preventDefault()
        const newItem={
            title: expenseTitle,
            price: expensePrice,
            date: new Date(expenseDate)
        }
        props.addedExpenses(newItem);
    }

    return(
        <div className="form_container">
            <h1>Add New Item</h1>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Title</label>
                    <input type="text" value={expenseTitle} onChange={handleTitleChange} />
                    </div>
                <div>
                    <label>Price</label>
                    <input type="number" value={expensePrice} onChange={handlePriceChange} />
                    </div>
                <div>
                    <label>Date</label>
                    <input type="date" onChange={handleDateChange} />
                    </div>
                <button className="submit-button">Add Item</button>

            </form>
        </div>
    )



}

export default ExpForm;