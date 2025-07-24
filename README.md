# Quiz Game

A console-based quiz application built with Java that tests your knowledge of Java programming fundamentals, specifically data type sizes.

## ✨ Features

- Console-based interactive quiz interface
- 5 Java programming questions focused on data type sizes
- Multiple choice questions with 4 options each
- Real-time score calculation
- Detailed feedback showing correct answers for wrong responses
- Final score display with question-by-question breakdown

## 🔧 Prerequisites

Before running this application, make sure you have the following installed:

- **Java Development Kit (JDK)** - Version 8 or higher
- **Java Runtime Environment (JRE)**
- A text editor or IDE (recommended: IntelliJ IDEA, Eclipse, or VS Code)

## 📥 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Sayan-Ghosh-183545/Quiz-Game.git
   ```

2. **Navigate to the project directory**
   ```bash
   cd Quiz-Game
   ```

3. **Compile the Java files**
   ```bash
   javac Main.java Questn.java Questnsrvc.java
   ```

## 🚀 How to Run

1. **Run the main class**
   ```bash
   java Main
   ```

2. **Follow the on-screen instructions** to start playing the quiz

## 🎮 How to Play

1. Launch the application by running `java Main`
2. The quiz will present 5 questions about Java data type sizes
3. For each question:
   - Read the question carefully
   - View the four available options
   - Type your answer (enter the exact option text)
   - Press Enter to submit
4. After completing all questions, view your detailed results:
   - See which answers were correct/incorrect
   - Get the correct answers for questions you missed
   - View your final score out of 5

## 📁 Project Structure

```
Quiz-Game/
├── Main.java              # Entry point of the application
├── Questn.java           # Question model class with properties and methods
├── Questnsrvc.java       # Quiz service class handling game logic
├── README.md
└── .gitignore
```

## 🔍 Code Overview

### Main.java
- **Purpose**: Entry point of the application
- **Functionality**: Creates a `Questnsrvc` instance, starts the quiz, and displays the final score

### Questn.java
- **Purpose**: Represents a single quiz question
- **Properties**: Question number, question text, 4 options, and correct answer
- **Methods**: 
  - Getters and setters for all properties
  - `showQuestions()`: Displays the question and options
  - `fetchQuestions()`: Updates question properties

### Questnsrvc.java
- **Purpose**: Manages the quiz logic and flow
- **Properties**: Array of 5 questions and user selections
- **Methods**:
  - Constructor: Initializes questions about Java data type sizes
  - `PlayQuiz()`: Handles the interactive quiz session
  - `CheckScore()`: Evaluates answers and provides detailed feedback

## 📚 Quiz Topics

The current quiz focuses on **Java Data Type Sizes**:
1. Size of int
2. Size of double  
3. Size of char
4. Size of long
5. Size of boolean

## 🛠 Technologies Used

- **Java** - Core programming language
- **Scanner Class** - For user input handling
- **Object-Oriented Programming** - Design paradigm with classes and objects
- **Arrays** - For storing questions and user responses
- **Console I/O** - Command-line interface

## 🎯 Sample Quiz Questions

Here's what you can expect:

```
Question no. : 1
size of int
2    6
4    8
Enter your answer : 4
```

## 🔮 Future Enhancements

- [ ] Add more question categories (OOP concepts, Collections, etc.)
- [ ] Implement randomized question order
- [ ] Add timer for each question
- [ ] Create difficulty levels (beginner, intermediate, advanced)
- [ ] Add more questions to the question bank
- [ ] Implement file-based question storage
- [ ] Add GUI interface using Swing/JavaFX
- [ ] Create user profiles and progress tracking

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


## 👤 Author

**Sayan Ghosh**
- GitHub: [@Sayan-Ghosh-183545](https://github.com/Sayan-Ghosh-183545)

## 🙏 Acknowledgments

- Thanks to all contributors who helped improve this project
- Inspired by classic quiz games and educational applications

---

**Enjoy the Quiz Game! 🎉**

*If you find this project helpful, please consider giving it a ⭐ on GitHub!*
