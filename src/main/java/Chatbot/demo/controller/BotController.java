package Chatbot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

    @GetMapping("/ChatBot")
    public String responderMensagem(@RequestParam(value = "mensagem", defaultValue = "") String mensagem) {
        mensagem = mensagem.toLowerCase().trim();
        
     switch (mensagem) {
     	case "olá":
     	case "oi":
         return "Seja bem vindo(a), eu sou o assistente virtual da Padaria Empório do Pão."
         		+ "<br>1- Fazer um pedido"
         		+ "<br>2- Falar com o financeiro"
         		+ "<br>3- Tirar duvidas"
         		+ "<br>4- Fala com atentende";
     	case "1":
     		return "Ótimo, vou estar encaminhando pra ti nosso cardapio, nele contém opções de doces, salgados e bolos."
     				+ "<br>Fique avontade para escolher e me encaminhar seu pedido,"
     				+ " <br> (LINK DO CARDAPIO)";
     	case "2":
     		return "Ok, você será direcionado para o nosso setor financeiro, dentro de alguns minutos será atendido";
     	case "3":
     		return "Certo, qual a sua duvida?";
     	case "4":
     		return "Você será direcionado para nosso setor de atendimento, dentro de alguns minutos será atendido";
     	default:
         return "Desculpe, não entendi sua mensagem. Tente selecionar umas das opções sugeridas"
         		+ "(1, 2, 3 ou 4)";
    
     	}  
    }
}
