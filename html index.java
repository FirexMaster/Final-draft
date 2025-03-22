<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forex Prop Firm</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</head>
<body>
    <header>
        <h1>Forex Proprietary Trading Firm</h1>
        <nav>
            <a href="#" onclick="showSection('home')">Home</a>
            <a href="#" onclick="showSection('challenges')">Challenges</a>
            <a href="#" onclick="showSection('login')">Login</a>
            <a href="#" onclick="showSection('register')">Register</a>
        </nav>
    </header>

    <!-- Home Section -->
    <div id="home" class="container">
        <h2>Welcome to Our Prop Firm</h2>
        <p>Join our funded trading program and prove your skills.</p>
    </div>

    <!-- Challenges Section -->
    <div id="challenges" class="container" style="display: none;">
        <h2>Choose Your Challenge</h2>
        
        <div class="challenge-box">
            <h3>$6,000 Challenge</h3>
            <p>Prove your trading skills with our $6,000 challenge.</p>
            <button class="btn" onclick="redirectToPayment(6000)">Get</button>
        </div>

        <div class="challenge-box">
            <h3>$10,000 Challenge</h3>
            <p>Step up and trade with a $10,000 evaluation account.</p>
            <button class="btn" onclick="redirectToPayment(10000)">Get</button>
        </div>

        <div class="challenge-box">
            <h3>$50,000 Challenge</h3>
            <p>Take on the ultimate test with our $50,000 challenge.</p>
            <button class="btn" onclick="redirectToPayment(50000)">Get</button>
        </div>
    </div>

    <!-- Payment Section -->
    <div id="payment" class="container" style="display: none;">
        <h2>Complete Your Payment</h2>
        <p>You are purchasing a <span id="challengeAmount"></span> challenge.</p>

        <button class="btn pay-btn" onclick="showCryptoPayment()">Pay with Crypto</button>
        <button class="btn pay-btn">Pay with Card</button>

        <div id="cryptoPayment" class="crypto-box" style="display: none;">
            <h3>Crypto Payment</h3>
            <p>Send **$100** to the BTC address below:</p>
            <p class="btc-address">3Eh5564fxjisDtnTJXwH4TNrWtvCEfwxGu</p>
        </div>

        <p><a href="#" onclick="showSection('challenges')">← Back to Challenges</a></p>
    </div>

    <!-- Contact Us Section -->
    <div id="contact" class="container">
        <h2>Contact Us</h2>
        <p>If you have any questions, feel free to reach out!</p>
        <p><i class="fas fa-envelope"></i> Email: <a href="mailto:musicdennoh@gmail.com">musicdennoh@gmail.com</a></p>
    </div>

    <footer>
        <p>© 2025 Forex Prop Firm. All Rights Reserved.</p>
    </footer>

    <script>
        function showSection(sectionId) {
            document.querySelectorAll('.container').forEach(section => section.style.display = 'none');
            document.getElementById(sectionId).style.display = 'block';
        }

        function redirectToPayment(amount) {
            document.getElementById("challengeAmount").textContent = "$" + amount;
            showSection('payment');
        }

        function showCryptoPayment() {
            document.getElementById("cryptoPayment").style.display = "block";
        }
    </script>
</body>
</html>