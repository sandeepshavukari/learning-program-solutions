// import logo from './logo.svg';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h1>Cohort Dashboard</h1>
      <CohortDetails
        name="React Bootcamp"
        startDate="2025-07-01"
        endDate="2025-08-01"
        status="Ongoing"
      />
      <CohortDetails
        name="Node.js Sprint"
        startDate="2025-06-01"
        endDate="2025-07-01"
        status="Completed"
      />
    </div>
  );
}

export default App;
