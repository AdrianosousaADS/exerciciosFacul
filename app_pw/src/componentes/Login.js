function Entrar(){
const userId = document.getElementById("userId").value
const senha = document.getElementById("senha").value
if (userId != null && senha === "lua") {
    alert("Bem-vindo");
}
else {
    alert("Senha ou usuário incorretos")
}
}
const Login = (props) => {
    return (
            <><div class="login">
                <label>UserID {props.userId}</label>
                <input type="text" id="userId" />
                <label>senha {props.senha}</label>
                <input type="password" id="senha" />
            </div>
            <div class="acoes">
                <button onClick={Entrar}>Entrar</button>
            </div></>
    );
};
export default Login;