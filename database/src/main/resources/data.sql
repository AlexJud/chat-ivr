-- INSERT INTO tags (name, comment, is_system)
-- VALUES ('Incoming', 'System tag for incoming calls', true);

INSERT INTO customer (login,password,name,surname,active)
VALUES ('1@m.ru','1234','Alex','Serov',true);

INSERT INTO scenario (name,json)
VALUES ('first','json');

INSERT INTO destination (point, scenario_id, customer_id)
VALUES ('700', '1', '1');


-- INSERT INTO endpoint_user_map(endpoint_id, user_id)
-- SELECT t1.id, t2.id
-- FROM endpoints as t1,
--      users as t2
-- WHERE t1.number = '400'
--   AND t2.email = 'test';

--     private String point;
--     @OneToOne
--     private Scenario scenario;
--     @ManyToOne
--     private Customer customer;

--     private String name;
--     private String json;


--     private String login;
--     private String password;
--     private String name;
--     private String surname;
--     private Boolean active;
