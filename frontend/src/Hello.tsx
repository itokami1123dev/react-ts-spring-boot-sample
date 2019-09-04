import * as React from 'react';

export interface Props {
    content: string;
}

export default function MyComponent(props: Props) {
    return <div className="column is-5-tablet is-4-desktop is-3-widescreen">
        <h1 className="title">HELLO!</h1>
        <h2 className="subtitle">{props.content}</h2>
    </div>
    ;
}