# Fawry-Fullstack-Task-2
## Overall Structure
 ### product classes
- Book Class: has ISBN, title, and year.
- EBook Class: inherits Book Class's attributes, and implements the Emailable and ForSale interfaces
- PaperBook Class: inherits Book Class's attributes, and implements the Shippable and ForSale interfaces.

### Interfaces 
As mentioned in the task description, different product types have different properties, and the application should be easily extensible. Implementing these interfaces helps express those properties and keep the app extensible.
- Shippable interface: has getStock() function
- ForSale interface: has getPrice() function
- Emailable interface: has getFileType() function

### Customer & Dashboard Classes
- Dashboard class: is responsible for adding and removing books, and books are stored in a static ArrayList for simplicity.

- Customer class: encapsulates customer's email, name, address, and has the buy book function that sends their email to the email service if they purchase an ebook or sends their address to the shipping service if they are buying a paper book

## Test Class
the test class covers the Adding, Removing and Buying books as per the task discription:
![Screenshot 2025-07-09 184556](https://github.com/user-attachments/assets/aadc3b52-48fd-4e5d-b64e-126ae18ca67a)


