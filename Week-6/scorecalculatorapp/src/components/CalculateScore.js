// import React from 'react';

function CalculateScore(props) {
  const { name, school, total, goal } = props;
  const average = total / 2;
  const goalMet = average >= goal ? 'Achieved' : 'Needs Improvement';

  return (
    <div className="score-card">
      <h2 className="student-name">Student: {name}</h2>
      <p className="student-detail">School: {school}</p>
      <p className="student-detail">Total Score: {total}</p>
      <p className="student-detail">Goal: {goal}</p>
      <p className="student-detail">Average Score: {average.toFixed(2)}</p>
      <p className="goal-status">Goal Status: {goalMet}</p>
    </div>
  );
}

export default CalculateScore;
