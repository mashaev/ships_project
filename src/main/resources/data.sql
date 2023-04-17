
                                                                                                                                                                                                                                                               
----classes(class_name,type,country,numGuns,bore,displacement)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
insert into classes(class_name,type,country, num_guns,bore,displacement)values ('Bismarck', 'bb', 'Germany', 8, 15, 42000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('Iowa','bb','USA',9,16,46000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('Kongo','bc','Japan',8,14,32000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('North Carolina','bb','USA',12,16,37000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('Renown','bc','Gt.Britain',6,15,32000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('Revenge','bb','Gt.Britain',8,15,29000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('Tennessee','bb','USA',12,14,32000);
insert into classes(class_name,type,country,num_guns,bore,displacement) values('Yamato','bb','Japan',9,18,65000);

;

                                                                                                                                                                                                                                                                 
----battles(class_name,date)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
insert into battles(class_name,date) values('Guadalcanal','19421115 00:00:00.000');
insert into battles(class_name,date) values('North Atlantic','19410525 00:00:00.000');
insert into battles(class_name,date) values('North Cape','19431226 00:00:00.000');
insert into battles(class_name,date) values('Surigao Strait','19441025 00:00:00.000');
insert into battles values ('#Cuba62a'   , '19621020');
insert into battles values ('#Cuba62b'   , '19621025');

;

                                                                                                                                                                                                                                                                 
----ships(name,class_name,launched)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
insert into ships(name,class_name,launched) values('California','Tennessee',1921);
insert into ships(name,class_name,launched) values('Haruna','Kongo',1916);
insert into ships(name,class_name,launched) values('Hiei','Kongo',1914);
insert into ships(name,class_name,launched) values('Iowa','Iowa',1943);
insert into ships(name,class_name,launched) values('Kirishima','Kongo',1915);
insert into ships(name,class_name,launched) values('Kongo','Kongo',1913);
insert into ships(name,class_name,launched) values('Missouri','Iowa',1944);
insert into ships(name,class_name,launched) values('Musashi','Yamato',1942);
insert into ships(name,class_name,launched) values('New Jersey','Iowa',1943);
insert into ships(name,class_name,launched) values('North Carolina','North Carolina',1941);
insert into ships(name,class_name,launched) values('Ramillies','Revenge',1917);
insert into ships(name,class_name,launched) values('Renown','Renown',1916);
insert into ships(name,class_name,launched) values('Repulse','Renown',1916);
insert into ships(name,class_name,launched) values('Resolution','Renown',1916);
insert into ships(name,class_name,launched) values('Revenge','Revenge',1916);
insert into ships(name,class_name,launched) values('Royal Oak','Revenge',1916);
insert into ships(name,class_name,launched) values('Royal Sovereign','Revenge',1916);
insert into ships(name,class_name,launched) values('Tennessee','Tennessee',1920);
insert into ships(name,class_name,launched) values('Washington','North Carolina',1941);
insert into ships(name,class_name,launched) values('Wisconsin','Iowa',1944);
insert into ships(name,class_name,launched) values('Yamato','Yamato',1941);
insert into ships(name,class_name,launched) values('South Dakota','North Carolina',1941) ;


;

                                                                                                                                                                                                                                                                 
----outcomes(ship,battle,result)------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
insert into outcomes(ship,battle,result) values('Bismarck','North Atlantic','sunk');
insert into outcomes(ship,battle,result) values('California','Surigao Strait','OK');
insert into outcomes(ship,battle,result) values('Duke of York','North Cape','OK');
insert into outcomes(ship,battle,result) values('Fuso','Surigao Strait','sunk');
insert into outcomes(ship,battle,result) values('Hood','North Atlantic','sunk');
insert into outcomes(ship,battle,result) values('King George V','North Atlantic','OK');
insert into outcomes(ship,battle,result) values('Kirishima','Guadalcanal','sunk');
insert into outcomes(ship,battle,result) values('Prince of Wales','North Atlantic','damaged');
insert into outcomes(ship,battle,result) values('Rodney','North Atlantic','OK');
insert into outcomes(ship,battle,result) values('Schamhorst','North Cape','sunk');
insert into outcomes(ship,battle,result) values('South Dakota','Guadalcanal','damaged');
insert into outcomes(ship,battle,result) values('Tennessee','Surigao Strait','OK');
insert into outcomes(ship,battle,result) values('Washington','Guadalcanal','OK');
insert into outcomes(ship,battle,result) values('West Virginia','Surigao Strait','OK');
insert into outcomes(ship,battle,result) values('Yamashiro','Surigao Strait','sunk');
insert into outcomes(ship,battle,result) values('California','Guadalcanal','damaged');