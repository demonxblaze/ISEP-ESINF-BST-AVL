package Exercicios;

import Domain.DayNumTrip;
import Domain.Trip;
import Domain.TripData;
import Domain.Vehicle;
import Domain.VehicleTypesStats;
import Trees.AVL;

import java.util.ArrayList;

public class EX2 {


/*
 * O presente projeto envolve a criação de uma biblioteca de classes respetivos métodos e testes que permitam gerir a informação relativa a trajetórias GPS que representam, viagens e respectivos consumos de combustível, energia, velocidade e uso de energia auxiliar1.
Os dados foram recolhidos de Novembro de 2017 a Novembro de 2018. Sendo a frota composta por um total de 384 automóveis pessoais (264 veículos a gasolina ICE, 93 veículos híbridos HEV e 27 veículos híbridos plug-in e eléctricos PHEV/EV) em Ann Arbor, Michigan, EUA.
O conjunto de dados é composto pela descrição e parâmetros de cada um dos 384 veículos (Dados Estáticos contidos nos ficheiros VED_Static_Data_ICE&HEV.xlsx e VED_Static_Data_PHEV&EV.xlsx) e pelos registos semanais de condução com marca temporal para os 384 veículos (Dados Dinâmicos: VED_mmddyy_week.csv onde mmddyy é o primeiro dia da semana a que os dados respeitam).
Dados Estáticos:
• Ficheiros: VED_Static_Data_ICE&HEV.xlsx e VED_Static_Data_PHEV&EV.xlsx
• Parâmetros de 384 veículos (264 a gasolina, 93 HEVs, e 27 PHEV/EVs):
• Colunas: VehId, Vehicle Type, Vehicle Class, Engine Configuration &
Displacement, Transmission, Drive Wheels, Generalized_Weight[lb] Dados Dinâmicos:
• Ficheiros de dados semanais: VED_mmddyy_week.csv (mmddyy + 7 dias)
• Dados das viagens (Trip) de determinado veículo (VehId)
• Colunas: DayNum, VehId, Trip, Timestamp(ms), Latitude[deg], Longitude[deg], Vehicle Speed[km/h], MAF[g/sec], Engine RPM[RPM], Absolute Load[%], Outside Air Temperature[DegC], Fuel Rate[L/hr], Air Conditioning Power[kW], Air Conditioning Power[Watts], Heater Power[Watts], HV Battery Current[A], HV Battery SOC[%], HV Battery Voltage[V], Short Term Fuel Trim Bank 1[%], Short Term Fuel Trim Bank 2[%], Long Term Fuel Trim Bank 1[%], Long Term Fuel Trim Bank 2[%]
Notas: Cada combinação de VehID, Trip é única. DayNum Representa o número de dias decorridos desde uma data de referência. (DayNum 1 = Nov, 1st, 2017, 00:00:00, DayNum 1.5 = Nov, 1st, 2017, 12:00:00)
A ligação entre as entidades dos dados estáticos (dados de veículos) e dados dinâmicos (viagens) é feita através do VehId.

EX2:
Para um intervalo temporal entre dois DayNum,
 obter o máximo, mínimo e média dos parâmetros Vehicle Speed[km/h], Absolute Load[%], OAT[DegC] agregados por tipo de veículo (Vehicle Type).

 */
public VehicleTypesStats getVehiclesStats(AVL<DayNumTrip> dayNumTripAVL, AVL<Vehicle> vehicleAVL, double dayNum1, double dayNum2){
    VehicleTypesStats vts = new VehicleTypesStats();
    AVL<DayNumTrip> filteredDayNumTripAVL = dayNumTripAVL.findBetween(new DayNumTrip(dayNum1,new AVL<>()), new DayNumTrip(dayNum2,new AVL<>()));
    ArrayList<DayNumTrip> dayNumTrips = (ArrayList<DayNumTrip>) filteredDayNumTripAVL.inOrder();
    for (DayNumTrip dayNumTrip: dayNumTrips) {
        ArrayList<Trip> trips = (ArrayList<Trip>) dayNumTrip.getTrips().inOrder();

        for (Trip trip: trips) {
            Vehicle vehicle = vehicleAVL.findElement(new Vehicle(trip.getVehid()));
            ArrayList<TripData> tripData = (ArrayList<TripData>) trip.getTripData().inOrder();

            for (TripData tData: tripData) {
                if (vehicle != null){
                switch (vehicle.getVehicleType()){
                    case "PHEV", "EV":
                    vts.checkPHEV(tData.getVehicleSpeed(), tData.getAbsoluteLoad(), tData.getOutsideTemp());
                    break;

                    case "HEV":
                        vts.checkHEV(tData.getVehicleSpeed(), tData.getAbsoluteLoad(), tData.getOutsideTemp());

                        break;
                    case "ICE":
                        vts.checkICE(tData.getVehicleSpeed(), tData.getAbsoluteLoad(), tData.getOutsideTemp());

                        break;
            }
            
          
        }


    }        
}
}
return vts;
}
}






