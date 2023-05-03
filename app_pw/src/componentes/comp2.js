import React, { useState } from "react";
import BusinessInfo from "./BusinessInfo";

function App() {
  const [nomeEmpresa, setnomeEmpresa] = useState("Meu Negócio");

  return (
    <div>
      <h1>{nomeEmpresa}</h1>
      <nomeEmpresa />
    </div>
  );
}

export default App;