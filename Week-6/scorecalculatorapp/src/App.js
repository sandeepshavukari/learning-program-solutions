// import logo from './logo.svg';
import './App.css';
import CalculateScore from './components/CalculateScore';

function App() {
  return (
    <div className="App">
     <CalculateScore
        name="Sandeep Shavukari"
        school="KL University"
        total={180} 
        goal={90}  
      />
    </div>
  );
}

export default App;
