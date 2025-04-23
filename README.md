# 📚 BedtimeStories Java Application

## 📝 Exercise 2 Description

This is a simple Java console application named **BedtimeStories** created as part of Exercise 2. The program allows users to read classic children's bedtime stories stored in text files, with each line of the story displayed alongside line numbers for better readability.

## 📂 Project Structure

The project includes three story files:

- `goldilocks.txt`
- `hansel_and_gretel.txt`
- `mary_had_a_little_lamb.txt`

These files must be placed in the root directory of the `BedtimeStories` project.

## 🚀 How It Works

1. The user is prompted to enter the name of the story (i.e., the file name).
2. The program uses a `Scanner` and `BufferedReader` to read the selected file.
3. Each line of the story is displayed in the console, prefixed with a line number.

## 🛠️ How to Run

1. Make sure you have Java installed.
2. Open your terminal or IDE (e.g., IntelliJ, Eclipse).
3. Place the three story `.txt` files in the same directory as your `.java` files.
4. Compile and run the main class:
   ```bash
   javac BedtimeStories.java
   java BedtimeStories
