import React from "react";
import ExpDate from "./ExpDate";
import './ExpItem.css';

const ExpItem = (props) =>{

    return(
        <div className='expense-item'>
            <ExpDate Date={props.Date} />
            <div className='expense-item__description'>
               <h2> {props.title} </h2>
               <div className='expense-item__price'> $ {props.price}</div>
            </div>             
        </div>
    )
}

export default ExpItem;