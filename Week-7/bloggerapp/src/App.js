import React from 'react';
import Book from './components/Book';

export const books = [
  { id: 101, bname: 'Master React', price: 670 },
  { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
  { id: 103, bname: 'Mongo Essentials', price: 450 }
];

function App() {
  const bookdet = books.map(book => (
    <Book key={book.id} bname={book.bname} price={book.price} />
  ));

  const content = (
    <>
      <h3>React Learning</h3>
      <h4>Stephen Biz</h4>
      <p>Welcome to learning React!</p>
      <h3>Installation</h3>
      <h4>Schwezdenier</h4>
      <p>You can install React from npm.</p>
    </>
  );

  const coursedet = (
    <>
      <h3>Angular</h3>
      <h4>4/5/2021</h4>
      <h3>React</h3>
      <h4>6/3/20201</h4>
    </>
  );

  return (
    <div style={{ display: 'flex', justifyContent: 'space-around', marginTop: '50px' }}>
      <div className="mystyle1">
        <h1>Course Details</h1>
        {coursedet}
      </div>
      <div className="mystyle1">
        <h1>Book Details</h1>
        {bookdet}
      </div>
      <div className="mystyle1">
        <h1>Blog Details</h1>
        {content}
      </div>
    </div>
  );
}

export default App;
