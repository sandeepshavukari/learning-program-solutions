import React from 'react';
import './App.css';

function App() {
    const element = "Office Space";
    const jsxatt = (
        <img 
            src="/OfficeSpace.jpg" 
            style={{ width: '300px', maxWidth: '100%', height: 'auto' }} 
            alt="Office Space" 
        />
    );

    const ItemName = { Name: "DBS", Rent: 50000, Address: 'Chennai' };

    const getRentColor = (rent) => {
        return rent <= 60000 ? 'red' : 'green';
    };

    return (
        <div className="App">
            <h1>{element}, at Affordable Range</h1>
            {jsxatt}
            <h1>Name: {ItemName.Name}</h1>
            <h3 style={{ color: getRentColor(ItemName.Rent) }}>
                Rent: Rs. {ItemName.Rent}
            </h3>
            <h3>Address: {ItemName.Address}</h3>
        </div>
    );
}

export default App;
