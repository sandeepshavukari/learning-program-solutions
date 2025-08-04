import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleAmountChange = (e) => {
    setAmount(e.target.value);
  };

  const handleCurrencyChange = (e) => {
    setCurrency(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const amountValue = parseFloat(amount);
    if (!isNaN(amountValue) && currency.trim() !== '') {
      let result;
      if (currency.toLowerCase() === 'euro') {
        const conversionRate = 0.0099;
        result = amountValue * conversionRate;
        alert(`Converting to Euro: €${result.toFixed(2)}`);
      } else {
        alert('Currently only conversion to Euro is supported.');
      }
    } else {
      alert('Please enter a valid amount and currency');
    }
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Amount:
          <input type="number" value={amount} onChange={handleAmountChange} />
        </label>
        <br /><br />
        <label>
          Currency:
          <input
            type="text"
            value={currency}
            onChange={handleCurrencyChange}
            placeholder="e.g., Euro"
          />
        </label>
        <br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
