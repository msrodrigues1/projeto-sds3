import NavBar from "components/NavBar";
import FooterBar from "components/Footer";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Olá mundo!</h1>
        <DataTable />
      </div>
      <FooterBar />
    </>
  );
}

export default App;
