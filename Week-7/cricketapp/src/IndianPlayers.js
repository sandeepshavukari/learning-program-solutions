import React from 'react';

export function OddPlayers({ IndianTeam }) {
    const [first, , third, , fifth] = IndianTeam;
    return (
        <div>
            <ul>
                <li>First: {first}</li>
                <li>Third: {third}</li>
                <li>Fifth: {fifth}</li>
            </ul>
        </div>
    );
}

export function EvenPlayers({ IndianTeam }) {
    const [, second, , fourth, , sixth] = IndianTeam;
    return (
        <div>
            <ul>
                <li>Second: {second}</li>
                <li>Fourth: {fourth}</li>
                <li>Sixth: {sixth}</li>
            </ul>
        </div>
    );
}

export function ListofIndianPlayers({ IndianPlayerss }) {
    return (
        <div>
            <ul>
                {IndianPlayerss.map((player, index) => (
                    <li key={index}>Mr. {player}</li>
                ))}
            </ul>
        </div>
    );
}

export const T20Players = ['Surya', 'Gill', 'Pant'];
export const RanjiTrophyPlayers = ['Pujara', 'Rahane', 'Iyer'];
export const IndianTeam = [...T20Players, ...RanjiTrophyPlayers];
