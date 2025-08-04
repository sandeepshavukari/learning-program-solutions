import './App.css';
import { EvenPlayers, IndianTeam, ListofIndianPlayers, OddPlayers } from './IndianPlayers';
import ListofPlayers from './ListofPlayers';

function App() {
    let flag = true; 

    return (
        <div>
            {flag ? (
                <div>
                    <h1>List of Players</h1>
                    <ListofPlayers />
                    <hr />
                    <h1>List of Players having Scores Less than 70</h1>
                    <ListofPlayers onlyBelow70={true} />
                </div>
            ) : (
                <div>
                    <h1>Indian Team</h1>
                    <h1>Odd Players</h1>
                    <OddPlayers IndianTeam={IndianTeam} />
                    <h1>Even Players</h1>
                    <EvenPlayers IndianTeam={IndianTeam} />
                    <hr />
                    <h1>List of Indian Players Merged:</h1>
                    <ListofIndianPlayers IndianPlayerss={IndianTeam} />
                </div>
            )}
        </div>
    );
}

export default App;
