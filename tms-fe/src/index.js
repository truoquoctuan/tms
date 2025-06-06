import ReactDOM from 'react-dom/client';
import App from './App';
import './assets/styles/index.scss';

import { AppProvider } from './context/Context';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    // <React.StrictMode>

    <AppProvider>
        <App />
    </AppProvider>

    // </React.StrictMode>
);
