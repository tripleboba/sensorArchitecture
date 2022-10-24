# Sensors System Architecture
Coursework of Systems Architecture itec3030

🧰 Java | 🤝 group assignment (team of 3) w/ [Chris](https://github.com/ZenonZeni?tab=repositories)👤 and T.👤 | 📚 YorkU <br>

🗂 Interfaces: all the interfaces JAR of need-to-be-implemented components of the systems<br>
🗂 JavaDocs: documentation for all the interfaces

📑prof's requirements: desgin the SmartHomeConsortium sensors system that devices from different vendors are able to implemented through the use of Interfaces.<br>
⚙️SHC system components:
- 🌡Sensors (collect temperature):
  - various temperature sensors
  - a thermostat (allow building habitants set desired temperature)
- 🌬Actuators (change the temperature): a furnace
- 📟Controller: receives data from sensors and issues actions to actuators
- Simple Smart Device Collaboration Standard (SSDCS) in form of a set of Java Interfaces: 
📦[SSDC](https://github.com/phganh/sensorArchitecture/blob/80786227e58a51d54d3d0cf95da3ba33c41991a8/Interfaces/Standards.jar)
📦[JavaDoc](https://github.com/phganh/sensorArchitecture/blob/80786227e58a51d54d3d0cf95da3ba33c41991a8/JavaDocs/Standards-javadoc.zip)
---
📎 Room class: models the room and keep track all the devices<br>
📎 Building class: collection of Rooms and the furnace<br>
📎 Controller class: models the controller device - collects info from sensors, sends actions to actuators via Room and Building classes<br>
📎 Main class: where the apartment is built

📑 req 1: implement the system to an apartment
- [x] 2 OmniTempSensorXS3 sensors in living room 🛋 & 1 OmniTempSensorXS3 sensor in bedroom 🛏
<br>🌡OmniTempSensorXS3:
📦[SSDCS-compliant driver](https://github.com/phganh/sensorArchitecture/blob/80786227e58a51d54d3d0cf95da3ba33c41991a8/Interfaces/ClassLibrary-Sensor1.jar)
📦[JavaDoc](https://github.com/phganh/sensorArchitecture/blob/80786227e58a51d54d3d0cf95da3ba33c41991a8/JavaDocs/OmniTempSensor-JavaDoc.zip)
- [x] 🌬use SaharaFurnaceHL42 furnace
📦[SSDCS-compliant driver](https://github.com/phganh/sensorArchitecture/blob/80786227e58a51d54d3d0cf95da3ba33c41991a8/Interfaces/ClassLibrary-Furnace.jar)
📦[JavaDoc](https://github.com/phganh/sensorArchitecture/blob/80786227e58a51d54d3d0cf95da3ba33c41991a8/JavaDocs/Furnace-JavaDoc.zip)

📑 req 2: thermostates ThermoSetX19 implement the SHC's SSDCS
- [x] implement SSDCS-compliant driver for ThermoSetX19
- [x] build ThermoSetX19's documentation and host it on Heroku
- [x] implement ThermoSetX19 to the apartment's design


📑 req 4:
- [x] [Description and Models of the system](https://drive.google.com/file/d/1CxyhxEKsYEFAdQqP1vvTDcu36GwuUXk8/view?usp=sharing)

✏️knowledge outcome:
- documentation style, interfaces, abstract classes
