<!-- hello.jsp -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <title>Harsh Gohil - Profile</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
      overflow: hidden;
    }

    .circle {
      position: absolute;
      border-radius: 50%;
      background: rgba(255, 255, 255, 0.05);
      animation: float 6s ease-in-out infinite;
    }

    .circle:nth-child(1) {
      width: 200px;
      height: 200px;
      top: 10%;
      left: 10%;
    }

    .circle:nth-child(2) {
      width: 300px;
      height: 300px;
      bottom: 15%;
      right: 15%;
    }

    @keyframes float {
      0% { transform: translateY(0); }
      50% { transform: translateY(-20px); }
      100% { transform: translateY(0); }
    }

    .card {
      position: relative;
      background: #fff;
      padding: 60px 40px;
      border-radius: 16px;
      box-shadow: 0 15px 30px rgba(0,0,0,0.2);
      text-align: center;
      max-width: 400px;
      z-index: 1;
    }

    .avatar {
      width: 100px;
      height: 100px;
      border-radius: 50%;
      background: #ddd;
      margin: 0 auto 20px;
      background-image: url('./gitprofile.jpg'); /* Replace with your image */
      background-size: cover;
      background-position: center;
    }

    h1 {
      margin: 10px 0 0 0;
      font-size: 28px;
      color: #333;
    }

    h2 {
      margin-top: 5px;
      font-size: 18px;
      color: #777;
      font-weight: normal;
    }

    p {
      margin-top: 20px;
      font-size: 16px;
      color: #555;
      line-height: 1.6;
    }

    .badge {
      display: inline-block;
      background: #667eea;
      color: #fff;
      padding: 8px 16px;
      border-radius: 20px;
      font-size: 14px;
      margin-top: 15px;
    }

    .social {
      margin-top: 25px;
    }

    .social a {
      text-decoration: none;
      display: inline-block;
      margin: 0 10px;
      color: #667eea;
      font-size: 20px;
      transition: transform 0.3s ease, color 0.3s ease;
    }

    .social a:hover {
      color: #764ba2;
      transform: translateY(-4px);
    }
  </style>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" rel="stylesheet">
</head>
<body>
  <div class="circle"></div>
  <div class="circle"></div>

  <div class="card">
    <div class="avatar"></div>
    <h1>Harsh Gohil</h1>
    <h2>Surat, India</h2>
    <p>Hello! I am Harsh, 19 years old, currently studying at Parul University. Passionate about tech, learning and growing every day.</p>
    <div class="badge">Student x Developer</div>
    <div class="social">
      <a href="#"><i class="fab fa-linkedin"></i></a>
      <a href="#"><i class="fab fa-github"></i></a>
      <a href="#"><i class="fas fa-envelope"></i></a>
    </div>
  </div>
</body>
</html>
