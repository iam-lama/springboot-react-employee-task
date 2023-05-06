import React from "react";
import './ExpDate.css';
import './ExpItem.css';

const ExpDate = (props) =>{
    let date = new Date(props.Date) 
    let month = date.toLocaleString('en-US',{month:"short"});
    let day = date.toLocaleString('en-US',{day:"2-digit"});
    let year = date.getFullYear();
    return(
        <div>
            <div className='expense-item__price'> 
             <div>{day}</div>
            <div>{month}</div>
             <div>{year}</div>
             </div>
        </div>
    )
}

export default ExpDate;