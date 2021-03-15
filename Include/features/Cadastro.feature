#language: pt
#encoding: UTF-8
#author: Marcos.Barbosa
#version: 1.0

Funcionalidade: Validar cadastro na aplicação

	Esquema do Cenario: Cadastro com sucesso
		Dado que acesso a aplicação
		E clico no menu My Account
		E preencho os dados de cadastro com <email>
		Quando clico no botão register
		Entao visualizo a tela my account logada
		
	Exemplos:
	| 				email 						|
	|  testes@tetes1234.com     |
	|  qa@12345678teste.com     |