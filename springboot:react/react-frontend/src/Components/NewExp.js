import React from "react";


import ExpForm from "./ExpForm";

const NewExp = (props) =>{

    const onAddExpenses = (expenseResponse) =>{
        console.log(expenseResponse)
        props.onAddExpenses(expenseResponse)
    }

    return(
        <ExpForm addedExpenses={onAddExpenses} />
    )
}

export default NewExp;