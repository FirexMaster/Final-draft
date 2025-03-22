/* General Reset */
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

/* Body Styling */
body {
    background-color: #007bff;
    color: #fff;
    text-align: center;
    padding-bottom: 50px;
}

/* Header Styling */
header {
    background: #1a1a2e;
    color: #fff;
    padding: 20px;
}
nav {
    display: flex;
    justify-content: center;
    gap: 20px;
    margin-top: 10px;
}
nav a {
    text-decoration: none;
    color: white;
    background: #0f3460;
    padding: 10px 20px;
    border-radius: 5px;
    transition: 0.3s ease-in-out;
}
nav a:hover {
    background: #16213e;
}

/* Main Container */
.container {
    width: 90%;
    max-width: 800px;
    margin: auto;
    padding: 20px;
}

/* Challenge Box Styling */
.challenge-box {
    background: white;
    color: black;
    padding: 20px;
    border-radius: 10px;
    margin: 15px auto;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
    text-align: center;
    cursor: pointer;
    transition: 0.3s ease-in-out;
}
.challenge-box:hover {
    transform: scale(1.05);
}
.challenge-box h3 {
    color: #007bff;
    font-size: 22px;
    margin-bottom: 10px;
}
.challenge-box p {
    font-size: 16px;
    color: #333;
    margin-bottom: 15px;
}

/* Button Styling */
.btn {
    display: inline-block;
    background: linear-gradient(to right, #ff416c, #ff4b2b);
    color: white;
    padding: 12px 20px;
    font-size: 18px;
    font-weight: bold;
    margin-top: 10px;
    text-decoration: none;
    border-radius: 50px;
    border: none;
    cursor: pointer;
    transition: 0.3s ease-in-out;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
}
.btn:hover {
    transform: scale(1.05);
    box-shadow: 0px 6px 12px rgba(0, 0, 0, 0.3);
}

/* Special Payment Button Styling */
.pay-btn {
    background: linear-gradient(to right, #28a745, #218838);
}

/* Crypto Payment Box */
.crypto-box {
    background: #16213e;
    color: white;
    padding: 20px;
    margin-top: 20px;
    border-radius: 10px;
    text-align: center;
    box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
}
.crypto-box h3 {
    margin-bottom: 10px;
}
.btc-address {
    font-size: 18px;
    font-weight: bold;
    color: #ffcc00;
}

/* Footer Styling */
footer {
    background: #1a1a2e;
    color: white;
    padding: 10px;
    position: fixed;
    bottom: 0;
    width: 100%;
}