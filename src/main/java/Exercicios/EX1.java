package Exercicios;

import Domain.EX4.PairData;
import Domain.EX4.Trip;
import Domain.EX4.Vehicle;
import Domain.EX4.VehicleTrips;
import Scanners.FileScanner;
import Trees.*;

import java.util.List;

public class EX1 {


    // Carregar em BST ou AVL a informação relativa aos dados estáticos dos veículos e dados dinâmicos de
    //viagens, permitindo efetuar uma pesquisar por VehId para obter os dados estáticos do veículo bem
    //como todos os detalhes das viagens realizadas. Sem duplicar o carregamento de dados, a estrutura
    //também deverá permitir obter para uma determinada viagem (Trip) todos detalhes e leituras da
    //viagem e os detalhes do veículo associado

    public AVL<VehicleTrips> getAVL(List<Vehicle> vehicles, List<Trip> trips){

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


}
