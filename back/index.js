//Tratando Route Params
const express = require('express');
const server = express();

server.use(express.json());
//localhost:3000/veiculos/2  Listar um veiculo
//localhost:3000/veiculos   Listar todos os veiculos
//localhost:3000/veiculos/2  alterar um veiculo

const veiculosArray = ['Porche', 'Mercedez', 'Audi', 'Honda']
server.get('/veiculos/:indiceInput', (req, res) => {
    const { indiceInput } = req.params
    return res.json({veiculos: `O ID do veiculo é${veiculosArray[indiceInput]}`
    })
})

// Rota para listar todos os veiculos
server.get('/veiculos', (req, res) => {

    return res.json(veiculosArray);
})

//Rota para Adicionar um novo veiculo utilizando o REQUST BODY - POST
server.post('/veiculos', (req, res) => {

    const { nomeVeiculo } = req.body;
    veiculosArray.push(nomeVeiculo);
    return res.json(veiculosArray);
})

//Rota para alterar prato - PUT
server.put('/veiculos/:indice', (req, res) =>{

    const { indice } = req.params;
    const { nomeVeiculo } = req.body;

    veiculosArray[indice] = nomeVeiculo;

    return res.json(veiculosArray);
})

//Rota para deletar um veiculo - DELETE
server.delete('/pedido/:indice', (req, res) =>{

    const { indice } = req.params;

    veiculosArray.splice(indice,1);

    return res.json(veiculosArray);
})

server.listen(3000);