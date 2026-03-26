# 📦 Parcel Shipping System (Java)

![Java](https://img.shields.io/badge/Language-Java-blue)
![OOP](https://img.shields.io/badge/Concepts-OOP-green)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)

---

## 📖 Overview

The **Parcel Shipping System** is a Java-based console application that simulates the calculation of shipping costs for different types of parcels.

It demonstrates core **Object-Oriented Programming (OOP)** principles such as inheritance, polymorphism, and method overriding in a simple and practical way.

---

## 🚀 Features

* 📦 Standard parcel cost calculation
* 📦 Box parcel with additional handling charges
* 📦 Fragile parcel with insurance-based cost
* 🔁 Dynamic method overriding
* 🧱 Clean and reusable class structure

---

## 🧠 OOP Concepts Used

* **Inheritance** → `BoxParcel` and `FragileParcel` extend `Parcel`
* **Polymorphism** → Same method behaves differently for each object
* **Method Overriding** → Custom `shippingCost()` in subclasses
* **Encapsulation** → Controlled access via getters

---

## 🏗️ Project Structure

```id="j2bx7v"
Parcel (Base Class)
│
├── BoxParcel (Adds handling cost)
│
└── FragileParcel (Adds insurance cost)
```

---

## ⚙️ How It Works

* Base shipping cost = `50 + (weight × 10)`
* Box parcel → adds **Rs 25** handling fee
* Fragile parcel → adds **insurance %** to total cost

---

## ▶️ How to Run

```bash id="k3d9mw"
javac main.java
java main
```

---

## 📊 Example Output

```
========================
        Shipping
========================

--- Standard Parcel ---
Tracking Id: TCSK-001
Weight In Kg: 20.0
Shipping Cost: Rs 250.0

--- Box Parcel (+Rs 25 handling) ---
Shipping Cost: Rs 275.0

--- Fragile Parcel (+20% insurance) ---
Shipping Cost: Rs 300.0
```

---

## 💡 Future Improvements

* Add user input from console
* Support more parcel types
* Add GUI (Java Swing / JavaFX)
* Store parcel data using files or database

---

## 👨‍💻 Author

**Bilal Soomro**

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!
