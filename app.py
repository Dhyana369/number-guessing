from flask import Flask, render_template, request, redirect, session
import random
import time
import os

app = Flask(__name__)
app.secret_key = "secretkey"

def get_attempts(level):
    levels = {
        "easy": 10,
        "medium": 7,
        "hard": 3
    }
    return levels.get(level)

@app.route("/", methods=["GET", "POST"])
def index():
    if request.method == "POST":
        level = request.form["difficulty"]
        session["difficulty"] = level
        session["attempts"] = get_attempts(level)
        session["secret"] = random.randint(1, 100)
        session["start_time"] = time.time()
        session["attempts_taken"] = 0
        return redirect("/game")

    return render_template("index.html")

@app.route("/game", methods=["GET", "POST"])
def game():
    message = ""

    if request.method == "POST":
        guess = int(request.form["guess"])
        session["attempts_taken"] += 1
        session["attempts"] -= 1

        if guess == session["secret"]:
            total_time = round(time.time() - session["start_time"], 2)
            message = f"🎉 Correct! You guessed it in {session['attempts_taken']} attempts. Time: {total_time}s"
            return render_template("game.html", message=message, game_over=True)

        elif guess < session["secret"]:
            message = "Too Low!"
        else:
            message = "Too High!"

        if session["attempts"] <= 0:
            message = f"Game Over! The number was {session['secret']}"
            return render_template("game.html", message=message, game_over=True)

    return render_template("game.html",
                           message=message,
                           attempts=session.get("attempts"),
                           game_over=False)

@app.route("/restart")
def restart():
    session.clear()
    return redirect("/")

if __name__ == "__main__":
    port = int(os.environ.get("PORT", 5000))
    app.run(host="0.0.0.0", port=port)