import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(5);

  const incrementCounter = () => setCounter(prev => prev + 1);
  const decrementCounter = () => setCounter(prev => prev - 1);

  const sayHello = () => {
    alert("Hello! Member1");
  };

  const increaseAndGreet = () => {
    incrementCounter();
    sayHello();
  };

  const sayWelcomeMessage = (message) => {
    alert(message);
  };

  const handleClick = (event) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>{counter}</h1>
      <button onClick={increaseAndGreet}>Increment</button>
      <button onClick={decrementCounter}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcomeMessage("Welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>
      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
