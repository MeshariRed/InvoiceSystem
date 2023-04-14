<h1 align="center"> 
    Invoice System
</h1>

<h3 align="center"> 
    This code defines a class called "Invoice" that represents an invoice for a product or service.
</h3>

<p align="center">
    <a href="https://www.oracle.com/">
        <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="made-with-Java">
    </a>
    <img src="http://ForTheBadge.com/images/badges/built-with-love.svg" alt="built-with-love"><br> 
    <a href="https://github.com/MeshariRed">
        <img title="Author" src="https://img.shields.io/badge/Author-MeshariRed-blue.svg?color=54aeff&style=for-the-badge&logo=github" /><br>
    </a><br>
    <a href="https://github.com/MeshariRed/InvoiceSystem/blob/main/LICENSE">
        <img src="https://img.shields.io/github/license/MeshariRed/InvoiceSystem.svg" alt="LICENSE">
    </a>
    <img src="https://img.shields.io/github/watchers/MeshariRed/InvoiceSystem.svg" alt="Watching">
    <img src="https://img.shields.io/github/forks/MeshariRed/InvoiceSystem.svg" alt="Forks">
    <img src="https://img.shields.io/github/stars/MeshariRed/InvoiceSystem.svg" alt="Stars">
</p>


## Project introduction
This code defines a class called "Invoice" that represents an invoice for a product or service,
And anther class called "InvoiceTest" to testthe main class "Invoice".

## Quick revision
It has four private instance variables: 
- "theNumber" (a String representing the invoice number),
- "theDescription" (a String representing the description of the product or service),
- "theQuantity" (an integer representing the quantity of the product or service),
- "pricePreItem" (a double representing the price per item of the product or service).

## Features 
The class has a constructor that takes in values for all four instance variables and sets them accordingly. It also has getter
and setter methods for each instance variable, allowing the user to retrieve or modify the values of the instance variables.

The setter methods for "theQuantity" and "pricePreItem" have additional logic to ensure that the values being 
set are greater than zero.If they are not, the value is set to zero instead. Finally, the class has a method 
called "getTheInvoiceAmount" that calculates and returns the total amount of the invoice by multiplying the 
price per item by the quantity.


## Conclusion
Overall, this Project provides a simple and user-friendly for setting and managing Invoice.

All The Best

