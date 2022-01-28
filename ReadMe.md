# Return Ready Lab 18


### Overview

It has been a long day of studying, and you have the munchies so you decided to use the Code Differently Vending Machine. The vending machine doesn't accept cash, and only accepts credits stored on a card issued to each student. The card is preloaded with credits, and the credits are deducted after each purchase. After getting some delicious snacks, you can't help wondering “How are these machines programmed?”.  You discuss possible designs in class.  You enjoy the rest of the class programming your ideas.  

You’ve made several observations about the vending machine.  A terminal is used to convert money into credits.  Credits are loaded onto plastic cards.  This data is stored in a card’s magnetic strip.  Cards may be swiped at any code differently vending machine through it’s magnetic card reader.  Vending machines subtract credits from a card, and dispence food. The terminal is also used to check a card’s credit balance and ticket count, and to transfer credits or tickets between cards.

### Tasks

Write a Java program that models the properties, behaviors, and interactions of objects at the arcade.  You’ll also need a test classes that use JUNIT.  Write unit test to model actions that would drive the program such as object instantiations and card swipes.  All fields must be `private`.  Provide getter and any necessary setter methods.

### Cards

The magnetic strip cards offers limited storage space and zero computing power.  Cards store information about their current credit balance, and card number. Balance should ever be negative.  Individual cards are incapable of performing calculations, including simple addition, or realizing that their balances could go negative.

Every card is created with a unique integer identification number.  Although each individual card is incapable of simple addition, it’s still possible to perform calculations with properties that belong to all cards.

### Vending Items

Vending items require a certain number of credits to be purchased.  Each vending machine is equipped with a magnetic card reader and LCD display.  Swiping a card and making a selection reduces its credit balance.  Print the card number, item purchased, along with the new total.  Print a message if a card has insufficient credits to purchase.

### Terminals

Each terminal contains a magnetic card reader.  A terminal accepts money which is converted to credits on a card.  Money is accepted as whole numbers.  Credits are awarded at a rate of 2 credits for every $1.  Customers may use a Terminal to check their card’s balances.  Include the card’s number in this printout.  All or just a portion of credits may be transferred between cards. Always print a card’s balances when either credits are accessed through a terminal. Print when a item is purchased the remaining number of that item type in the terminal.

### Main Method

Instantiate 2 cards and whatever other objects might be necessary to test your program.

* Load credits onto each card
* Purchase a bunch of items using both cards.
* Transfer the balance of credits from Card 1 to Card 2.

### Requirements
* Complete the Spiral Document First `docs/lab18SPD.docx`
* After you complete the Spiral Document complete the `PropsAndBehaviorsTable`
* Next create a UML doc using [draw.io](http://draw.io)
* Create program, using TDD. All public methods of classes must be Tested.