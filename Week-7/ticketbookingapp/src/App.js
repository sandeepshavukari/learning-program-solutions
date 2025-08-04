import React, { useState } from 'react';
import './App.css';

function GuestGreeting() {
  return (
    <div>
      <h1>Please sign up.</h1>
      <p>As a guest, you can browse flight details.</p>
    </div>
  );
}

function UserGreeting() {
  return (
    <div>
      <h1>Welcome back!</h1>
      <p>You are logged in and can now book tickets.</p>
    </div>
  );
}

function LoginButton({ onClick }) {
  return <button onClick={onClick}>Login</button>;
}

function LogoutButton({ onClick }) {
  return <button onClick={onClick}>Logout</button>;
}

function Greeting({ isLoggedIn }) {
  return isLoggedIn ? <UserGreeting /> : <GuestGreeting />;
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div className="App">
      <header className="App-header">
        <Greeting isLoggedIn={isLoggedIn} />
        {isLoggedIn ? (
          <LogoutButton onClick={handleLogoutClick} />
        ) : (
          <LoginButton onClick={handleLoginClick} />
        )}
      </header>
    </div>
  );
}

export default App;