import {Product} from "./product";

export const PRODUCTS: Product[] = [
  {id: 1, name: "Hamburger", description: "Very good",price: 100, category: {name: "Burgers"}},
  {id: 2, name: "Cheeseburger", description: "So cheesy",price: 120, category: {name: "Burgers"}},
  {id: 3, name: "Tortilla", description: "Tasty",price: 80, category: {name: "Tortillas"}},
  {id: 4, name: "French fries", description: "Salted rich",price: 50, category: {name: "Side dishes"}},
  {id: 5, name: "Salad", description: "Fresh",price: 70, category: {name: "Side dishes"}},
];
