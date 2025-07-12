# Panellinies 2025 – Informatics Exam Final Exercise

This repository contains a Java implementation of the final exercise (Question D) from the Greek National Exams 2025 – Informatics subject. 
The full exercise prompt (translated into English) is included below.
This is a beginner level exercise that covers the very basics of java.
By being able to solve this, means that you have a clear understanding of arrays in general
and have also developed your "algorithming" thinking at an intermidiate level.
This exercise focuses more on thinking of how to find a solution to a certain question rather than looking for Java syntaxes.
That's why I suggest you to solve it in whatever language you want and not Java necessarily.

---

## 📄 Exercise Prompt (translated from Greek)

In the preliminary phase of a general knowledge competition, **100 students** participate by answering **30 multiple-choice questions**. Each question has only one correct answer. The possible choices are **‘A’, ‘B’, and ‘C’**.

Each correct answer awards **2 points**, while incorrect answers do not affect the score.

You are asked to develop a program in **GLΩSSA** (translated here into Java) that performs the following:

### D1.

* Include an appropriate declaration section.
  **\[2 points]**

### D2.

a) Read the correct answers (no validity check required) and store them in the array `corrects[30]`.
b) For each student, read their name and store it in the array `names[100]`.
c) For each student, read their answers to all questions and store them in a 2D array `answers[100][30]`, while validating that answers are only ‘A’, ‘B’, or ‘C’.
**\[5 points in total: 1 for a, 1 for b, 3 for c]**

### D3.

* For each student, calculate their total score using the function/method `SCORE` described in part D5. Store the total score in the array `grades[100]`.
  **\[4 points]**

### D4.

* Sort the students’ names and their scores in descending order of scores.
* Display the names of the **top 10 students**.
* If there are other students with the **same score as the 10th student**, include them in the output as well.
  **\[8 points]**

### D5.

* Implement the function/method `score` which:

  * Takes as parameters:

    * The 2D array `AP[100][30]` (student answers)
    * The array `SA[30]` (correct answers)
    * A number indicating a row (i.e., a student)
  * Returns the total score of the specified student.
    **\[6 points]**

---

## 🚀 How to Compile and Run

```bash
javac Main.java
java Main
```
