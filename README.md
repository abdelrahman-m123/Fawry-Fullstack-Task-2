# Fawry-Fullstack-Task-2
## overall structure
 ### product classes
- Book Class: has ISBN, title, year.
- EBook Class: inherites Book Class's attributes, and implements the Emailable and ForSale interfaces
- PaperBook Class: inherites Book Class's attributes, and implements the Shippable and ForSale interfaces.

### Interfaces 
as mentioned in the task different product types have different properties and the application should be easily extensible. implementing these interfaces helps express those properties and keep the app extensible.
- Shippable interface: has getStock() function
- ForSale interface: has getPrice() function
- Emailable interface: has getFileType() function

### Customer & Dashboard Classes
- Dashboard class: is responsible for adding and removing books and books are stored in a static arraylist for simplicity.

- Customer class: encapsulates customer's email, name, address and has the buy book function that sends thier email to the email service if they purchase an ebook or sends their address to the shipping service if they are buying a paper book

