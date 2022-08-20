import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <div className="carre">
        <h3 id="title">The title</h3>
        <img src={logo} alt="logo" id="img"></img>
        <div className="button">
          <button >Click</button>
        </div>
      </div>
    </div>
  );
}

export default App;
