# NumGuess

A fun **mini project** web-based Number Guessing Game built with Python Flask.  
Test your luck and skills by guessing the number selected by the computer!

---

## 🌟 Live Demo

Play the game here: [NumGuess Live](https://numguess-13sp.onrender.com)

---

## 🎯 Features

- Select difficulty: Easy, Medium, Hard  
- Limited number of attempts based on difficulty  
- Interactive messages for “Too High” / “Too Low”  
- Confetti animation on winning 🎉  
- Modern, responsive design with CSS  
- Play multiple rounds until you win  

---

## 📂 Project Structure

```
number-guessing-flask/
│
├── app.py # Main Flask app
├── templates/ # HTML templates
│ ├── index.html
│ └── game.html
├── static/ # CSS & other static files
│ └── style.css
├── requirements.txt # Python dependencies
├── Procfile # For Render deployment
└── README.md # Project documentation
```


---

## ⚡ How to Run Locally

1. Clone the repo:

```bash
git clone https://github.com/Dhyana369/number-guessing.git
```

2. Navigate to project folder:
```
cd number-guessing-flask
```

3. Create a virtual environment:
```
python3 -m venv venv
```

4. Activate the virtual environment:
```
source venv/bin/activate
```

5. Install dependencies:
```
pip install -r requirements.txt
```

6. Run the app:
```
python app.py
```

7. Open your browser:
```
http://127.0.0.1:5000
```

---
## 📌Notes

- Do not push venv/ to GitHub

- Game keeps track of attempts and winning time

- This is a mini project, perfect for learning Flask, templates, and interactive web apps

---
## ✅ How to Add This to Your Repo

1. Create the file in your project folder:

```bash
touch README.md
```

2. Open it in a text editor and paste the content above.

3. Save the file, then run:
```
git add README.md
git commit -m "Add README file"
git push
```
