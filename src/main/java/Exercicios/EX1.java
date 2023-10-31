package Exercicios;

import Domain.*;
import Trees.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EX1 {


    // Carregar em BST ou AVL a informação relativa aos dados estáticos dos veículos e dados dinâmicos de
    // viagens, permitindo efetuar uma pesquisar por VehId para obter os dados estáticos do veículo bem
    // como todos os detalhes das viagens realizadas. Sem duplicar o carregamento de dados, a estrutura
    // também deverá permitir obter para uma determinada viagem (Trip) todos detalhes e leituras da
    // viagem e os detalhes do veículo associado

    public Structures getStructures(List<String[]> vehiclesData, List<String[]> tripsData){

       AVL<VehicleTrips> vehicleTripsAVL = getVehicleTripsAVL(vehiclesData, tripsData);
         AVL<VehicleTripsDistance> vehicleTripsDistanceAVL = getVehicleTripsDistanceAVL(vehiclesData, tripsData);

       return new Structures(vehicleTripsAVL, vehicleTripsDistanceAVL);

    }
    private AVL<VehicleTripsDistance> getVehicleTripsDistanceAVL(List<String[]> vehiclesData, List<String[]> tripsData){

        List<Vehicle> vehicles = getVehicleList(vehiclesData);
        List<Trip> trips = getTripsList(tripsData);

        AVL<VehicleTripsDistance> vehicleTripsDistanceAVL = new AVL<>();

        for(Vehicle v : vehicles){
            VehicleTripsDistance temp = new VehicleTripsDistance(v);

            for(Trip t : trips){

                double distance = t.getTripDistanceEuclidean();

                if (temp.getTrips().findElement(new PairData<>(distance, null)) != null){
                    temp.getTrips().findElement(new PairData<>(distance, null)).getValue().add(t);

                } else {
                    Set<Trip> tripsSet = new HashSet<>();
                    tripsSet.add(t);
                    PairData<Double, Set<Trip>> pairData = new PairData<>(distance, tripsSet);
                    temp.getTrips().insert(pairData);
                }
            }

            vehicleTripsDistanceAVL.insert(temp);
        }

        return vehicleTripsDistanceAVL;

    }
    private AVL<VehicleTrips> getVehicleTripsAVL(List<String[]> vehiclesData, List<String[]> tripsData){


        List<Vehicle> vehicles = getVehicleList(vehiclesData);
        List<Trip> trips = getTripsList(tripsData);

        AVL<VehicleTrips> vehicleTripsAVL = new AVL<>();

        for(Vehicle v : vehicles){
            VehicleTrips temp = new VehicleTrips(v);
            for(Trip t : trips){
                if(t.getVehid() == v.getVehID()){
                    temp.addTrip(t);
                }
            }

            vehicleTripsAVL.insert(temp);
        }

        return vehicleTripsAVL;
    }

    private List<Vehicle> getVehicleList(List<String[]> vehiclesData) {

        List<Vehicle> vehicles = new ArrayList<>();

        for (String[] line : vehiclesData) {
            if (line[0].equals("NO DATA")) line[0] = "0";
            if (line[6].equals("NO DATA")) line[6] = "0";
            Vehicle vehicle = new Vehicle(Integer.parseInt(line[0]), line[1], line[2], line[3], line[4], line[5], Integer.parseInt(line[6]));
            vehicles.add(vehicle);
        }

        return vehicles;
    }

    private List<Trip> getTripsList(List<String[]> tripsData) {

        List<Trip> trips = new ArrayList<>();
        AVL<TripData> tempTripAVL = new AVL<>();
        int tempID = 0;
        Trip trip = null;
        for (String[] line : tripsData) {
            for (String s : line) {
                if (s.equals("NaN")) s = "0";
            }
            if (tempID!= Integer.parseInt(line[2]) || tempID == 0) {
                trip = new Trip(Integer.parseInt(line[1]), Integer.parseInt(line[2]), new AVL<TripData>());
                trips.add(trip);
                tempID = Integer.parseInt(line[2]);
            }

            TripData temp = new TripData(Double.parseDouble(line[0]), Double.parseDouble(line [3]), Double.parseDouble(line[4]),
                    Double.parseDouble(line[5]), Double.parseDouble(line[6]), Double.parseDouble(line[7]),
                    Double.parseDouble(line[8]), Double.parseDouble(line[9]), Double.parseDouble(line[10]),
                    Double.parseDouble(line[11]), Double.parseDouble(line[12]), Double.parseDouble(line[13]),
                    Double.parseDouble(line[14]), Double.parseDouble(line[15]), Double.parseDouble(line[16]),
                    Double.parseDouble(line[17]), Double.parseDouble(line[18]), Double.parseDouble(line[19]),
                    Double.parseDouble(line[20]), Double.parseDouble(line[21]));

            trip.addTripData(temp);


            tempID = Integer.parseInt(line[2]);
        }

        return trips;
    }

    public Vehicle searchByVehID(AVL<VehicleTrips> vehicleTripsAVL, int vehID){
        VehicleTrips temp = vehicleTripsAVL.findElement(new VehicleTrips(new Vehicle(vehID)));
        if(temp == null) return null;
        return temp.getVehicle();
    }

    public Trip searchByTripID(AVL<VehicleTrips> vehicleTripsAVL, int tripID){
        
        
        return null;
    }
}
