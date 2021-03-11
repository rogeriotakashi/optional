DROP TABLE IF EXISTS PESSOA;

CREATE TABLE PESSOA (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(200),
  idade INTEGER,
  tipo_pessoa VARCHAR(10)
);


INSERT INTO PESSOA (nome,idade,tipo_pessoa) VALUES
  ('Rogerio',24, 1);

INSERT INTO PESSOA (nome,idade,tipo_pessoa) VALUES
('Carlos',30, 2);