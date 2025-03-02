# 🔐 Encryptify

- Caesar Cipher Encryption & Decryption

## 📌 Overview
Caesar Cipher is a simple **substitution cipher** used in cryptography where each letter in a plaintext is **shifted by a fixed number** (shift key) in the alphabet to produce a ciphertext. This project provides **both encryption and decryption functionalities** implemented in **Java & Spring Boot (Backend)** and **React.js (Frontend)**.

---

## 📖 Terminology

- **Encryption**: The process of converting a message into an unreadable format using an algorithm so that only authorized users can access it.
- **Decryption**: The process of converting an encrypted message back to its original format.
- **Plaintext**: The original, readable message before encryption.
- **Ciphertext**: The encoded, unreadable message after encryption.
- **Shift Key**: A numeric value (between 0 and 25) that determines how much each letter in the plaintext is shifted.
  
---

## ⚡ Encryption & Decryption

### **🔑 Encryption Process**
- Given a **plaintext**, each letter is shifted forward in the alphabet by `shiftKey` positions.
- **Formula:**
-  Encryption: (x + n) mod 26

where:
- `x` = Position of character in the alphabet (0-25)
- `n` = Shift Key

✅ **Example** (Shift Key = 2):  

- Plaintext: vivek sanjay pawar - Ciphertext: xkxgm ucplca rcyct


---

### **🔓 Decryption Process**
- To retrieve the **original message**, we shift characters back by the given shift key.
- **Formula:**  
- Decryption: (x - n) mod 26
- 
 ✅ **Example** (Shift Key = 2):  

- Ciphertext: xkxgm ucplca rcyct - Plaintext: vivek sanjay pawar


---
## 💻Results.

![image](https://github.com/user-attachments/assets/7077894b-bbb9-4572-8c9a-3a7fb315ff81)

## 🌍 Real-World Applications of Caesar Cipher

1. **Basic Encryption in Ancient Times** 🏛️  
   - Used by **Julius Caesar** to securely communicate with his generals.

2. **Password Protection** 🔒  
   - Some early systems used **basic ciphers** to store passwords.

3. **Basic Captchas & Security Questions** 🤖  
   - Prevents **automated bots** from decoding simple messages.

4. **Simple Data Obfuscation** 🔏  
   - Used in some **low-level encryption** methods for hiding sensitive text.

---
