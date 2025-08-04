import React from 'react';

function Book(props) {
  return (
    <div>
      <h3>{props.bname}</h3>
      <h4>{props.price}</h4>
    </div>
  );
}

export default Book;
