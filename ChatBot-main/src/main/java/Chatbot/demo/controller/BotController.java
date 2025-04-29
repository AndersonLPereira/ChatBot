package Chatbot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotController {

    @GetMapping("/ChatBot")
    public String responderMensagem(@RequestParam(value = "mensagem", defaultValue = "") String mensagem) {
        mensagem = mensagem.toLowerCase().trim();
 
        
//Módulo de opções e respostas
     switch (mensagem) {
     	case "olá":
     	case "oi":
         return "Seja bem vindo(a) [Empresa]! Como podemos lhe ajudar?."
         		+ "1- Falar com atendimento\n"
         		+ "2- Duvidas sobre produtos\n"
         		+ "3- Horária de funcionamento\n"
         		+ "4- Cardápio\n";
     	case "1":
     		return "Certo, vou encaminhar para o setor de atendimento peço que aguarde um momento, em poucos minutos iremos lhe responder";
     	case "2":
     		return "Olá, tudo bem?"
     				+ "Qual seria a sua dúvida?";
     	case "3":
     		return "Nossos horarios de atendimento são:"
     				+ "Segunda-feira a Sexta feita: 07:00-12:00 / 13:30-19:00"
     				+ "Sábado: 07:00-12:00 / 13:30-17:00"
     				+ "Domingo: 07:00-09:00"
     				+ "Para feriados consular o setor de atendimento.";
     	case "4":
     		return "Hmmm que delicia, segue abaixo nosso cardapio"
     				+ "[LINK DO CARDAPIO]";
     		
     	//teste
     	default:
         return "Desculpe, não entendi sua mensagem. Tente selecionar umas das opções sugeridas"
         		+ "(1, 2, 3 ou 4)";
    
     	}  
    }
}
