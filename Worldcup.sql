create database worldcup;
use worldcup;
create table Teams(team_name varchar(256),
 team_id int PRIMARY KEY);
 create table Players(player_name varchar(256), 
 player_id int PRIMARY KEY, no_of_runs int, no_of_wickets int,
 designation varchar(256), team_id int ,
 foreign key(team_id) references Teams(team_id) 
 );
insert into Teams values("India", 1);
insert into Teams values("Australia", 2);
insert into Teams values("Pakistan", 3);
insert into Teams values("New Zealand", 4);
insert into Teams values("England",5);

insert into Players values("Dhoni", 101, 200 , 2 , "Batsman", 1);
insert into Players values("Hardik", 102, 255 , 3 , "Batsman", 1);
insert into Players values("Kumar", 103, 0 , 15 , "Bowler", 1);
insert into Players values("Shami", 104, 0 , 17 , "Bowler", 1);


insert into Players values("Aus1", 105, 40 , 0 , "Batsman", 2);
insert into Players values("Aus2", 106, 43 , 0 , "Batsman", 2);
insert into Players values("Aus3", 107, 0 , 13 , "Bowler", 2);
insert into Players values("Aus4", 108, 0 , 12 , "Bowler", 2);

insert into Players values("Pak1", 109, 70 , 0 , "Batsman", 3);
insert into Players values("Pak2", 110, 50 , 0 , "Batsman", 3);
insert into Players values("Pak3", 111, 10 , 22 , "Bowler", 3);
insert into Players values("Pak4", 112, 10 , 15 , "Bowler", 3);

insert into Players values("New1", 113, 60 , 0 , "Batsman", 4);
insert into Players values("New2", 114, 157 , 1 , "Batsman", 4);
insert into Players values("New3", 115, 0 , 16 , "Bowler", 4);
insert into Players values("New4", 116, 0 , 14 , "Bowler", 4);

insert into Players values("Eng1", 117, 150 , 2 , "Batsman", 5);
insert into Players values("Eng2", 118, 165 , 3 , "Batsman", 5);
insert into Players values("Eng3", 119, 0 , 6 , "Bowler", 5);
insert into Players values("Eng4", 120, 0 , 12 , "Bowler", 5);

create table Tournament(year varchar(256) primary key);
create table Matches(team1_id int, team2_id int, winner int,
team1_score int , team2_score int, match_id int primary key,
year varchar(256), foreign key(year) references Tournament(year));

insert into Tournament values("1983");
insert into Tournament values("1987");
insert into Tournament values("1991");
insert into Tournament values("1995");
insert into Tournament values("1999");

insert into Matches values(1, 2, 1, 100, 80, 1, 1983);
insert into Matches values(2, 3, 2, 200, 280, 2, 1983);
insert into Matches values(1, 4, 1, 300, 180, 3, 1983);
insert into Matches values(1, 5, 2, 400, 380, 4, 1983);
insert into Matches values(2, 4, 1, 500, 380, 5, 1983);
insert into Matches values(2, 5, 1, 600, 480, 6, 1983);
insert into Matches values(3, 5, 1, 700, 580, 7, 1983);
insert into Matches values(4, 5, 1, 800, 380, 8, 1983);

-- Query 1
select player_name, no_of_runs from Players order by no_of_runs 
DESC LIMIT 5;

-- Query 2
select player_name, no_of_wickets from Players order by
 no_of_wickets DESC LIMIT 5;

-- Query 3
create view temp as  ( select team1_id as team_id , team1_score as 
score from Matches union select team2_id as team_id, team2_score 
as score from Matches) ;

create view temp2 as (select team_id, avg(score) as average_score from temp 
group by team_id);

create view temp3 as (select team_id, min(average_score) from 
temp2);

-- Query 4
UPDATE Players
SET no_of_runs = no_of_runs + 10 
where team_id in (select team_id from temp3) 
and player_id >=1;

-- Query 5
select player_name, no_of_runs from Players;



  
 
 
