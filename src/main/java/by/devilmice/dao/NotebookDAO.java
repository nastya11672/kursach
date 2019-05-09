package by.devilmice.dao;

import by.devilmice.model.NewsEntity;
import by.devilmice.model.NotebookEntity;
import by.devilmice.utils.DAOInterface;
import by.devilmice.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NotebookDAO implements DAOInterface<NotebookEntity> {

    public NotebookDAO() {


    }

    public void add(NotebookEntity entity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();
        Query query =  session.createQuery("delete NotebookEntity where id = :param");
        query.setParameter("param", id);
        query.executeUpdate();
        tx.commit();
        session.close();
    }

    public void edit(NotebookEntity entity) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();


        session.beginTransaction();
        Query query = session.createQuery("update NotebookEntity set title = :titleParam, releaseDate = :releaseDateParam" +
                ", type = :typeParam, assigned = :assignedParam, platform = :platformParam," +
                "processor = :processorParam, processorModel = :processorModelParam," +
                "countCores = :countCoresParam, clockFrequency = :clockFrequencyParam, turboFrequency = :turboFrequencyParam," +
                "tdp = :tdpParam, bgp = :bgpParam, bodyMaterial = :bodyMaterialParam, bodyColor = :bodyColorParam," +
                "coverMaterial = :coverMaterialParam, coverColor = :coverColorParam, resistance = :resistanceParam," +
                "width = :widthParam, depth = :depthParam, thickness = :thicknessParam, weight = :weightParam," +
                "screenDiagonal = :screenDiagonalParam, screenResolution = :screenResolutionParam," +
                "screenFrequency = :screenFrequencyParam, screenTechnology = :screenTechnologyParam," +
                "screenSurface = :screenSurfaceParam, touchScreen = :touchScreenParam, ramType = :ramTypeParam," +
                "ramFrequency = : ramFrequencyParam, capacityRam = :capacityRamParam, maxCapacityRam = :maxCapacityRamParam," +
                "countSlotRam = :countSlotRamParam, typeDrive = :typeDriveParam, capacitydrivehdd = :capacitydrivehdd," +
                "capacitydrivessd = :capacitydrivessdParam, odd = :oddParam, cardSlot = :cardSlotParam," +
                "discreteGraphics = :discreteGraphicsParam, nameGraphics = :nameGraphicsParam, capacityVideoMemory = :capacityVideoMemoryParam," +
                "builtCamera =: builtCameraParam, cameraPixels =:cameraPixelsParam, builtMic = :builtMicParam," +
                "builtSound = :builtSoundParam, numpad =: numpadParam, keypboardIllum =:keypboardIllumParam," +
                "cyrillicKeys =:cyrillicKeysParam, cursorControl =:cursorControlParam, fingerScanner =:fingerScannerParam," +
                "simCard =:simCardParam, nfc = :nfcParam, bt =: btPram, lan =:lanParam, wifi =:wifiParam," +
                "countUsb = :countUsbParam, usb20 = :usb20Param, usb30 = :usb30Param, usb31Typea = :usb31TypeaParam," +
                "usb31Typec = :usb31TypecParam, vga = :vgaParam, hdmi = :hdmiParam, displayport = :displayportParam," +
                "thunderbolt = :thunderboltParam, audioIn = :audioInParam, countCell = :countCellParam," +
                "energyReserv = :energyReservParam, os = :osParam, deliverySet =:deliverySet, price = :priceParam," +
                "vendor = :vendorParam where id = :idParam");




        query.setParameter("titleParam", entity.getTitle());
        query.setParameter("releaseDateParam", entity.getReleaseDate());
        query.setParameter("typeParam", entity.getType());
        query.setParameter("assignedParam", entity.getAssigned());
        query.setParameter("platformParam", entity.getPlatform());
        query.setParameter("processorParam", entity.getProcessor());
        query.setParameter("processorModelParam", entity.getProcessorModel());
        query.setParameter("countCoresParam", entity.getCountCores());
        query.setParameter("clockFrequencyParam", entity.getClockFrequency());
        query.setParameter("turboFrequencyParam", entity.getTurboFrequency());
        query.setParameter("tdpParam", entity.getTdp());
        query.setParameter("bgpParam", entity.getBgp());
        query.setParameter("bodyMaterialParam", entity.getBodyMaterial());
        query.setParameter("bodyColorParam", entity.getBodyColor());
        query.setParameter("coverMaterialParam", entity.getCoverMaterial());
        query.setParameter("coverColorParam", entity.getCoverColor());
        query.setParameter("resistanceParam", entity.getResistance());
        query.setParameter("widthParam", entity.getWidth());
        query.setParameter("depthParam", entity.getDepth());
        query.setParameter("thicknessParam", entity.getThickness());
        query.setParameter("weightParam", entity.getWeight());
        query.setParameter("screenDiagonalParam", entity.getScreenDiagonal());
        query.setParameter("screenResolutionParam", entity.getScreenResolution());
        query.setParameter("screenFrequencyParam", entity.getScreenFrequency());
        query.setParameter("screenTechnologyParam", entity.getScreenTechnology());
        query.setParameter("screenSurfaceParam", entity.getScreenSurface());
        query.setParameter("touchScreenParam", entity.getTouchScreen());
        query.setParameter("ramTypeParam", entity.getRamType());
        query.setParameter("ramFrequencyParam", entity.getRamFrequency());
        query.setParameter("capacityRamParam", entity.getCapacityRam());
        query.setParameter("maxCapacityRamParam", entity.getMaxCapacityRam());
        query.setParameter("countSlotRamParam", entity.getCountSlotRam());
        query.setParameter("typeDriveParam", entity.getTypeDrive());
        query.setParameter("capacitydrivehdd", entity.getCapacitydrivehdd());
        query.setParameter("capacitydrivessdParam", entity.getCapacitydrivessd());
        query.setParameter("oddParam", entity.getOdd());
        query.setParameter("cardSlotParam", entity.getCardSlot());
        query.setParameter("discreteGraphicsParam", entity.getDiscreteGraphics());
        query.setParameter("nameGraphicsParam", entity.getNameGraphics());
        query.setParameter("capacityVideoMemoryParam", entity.getCapacityVideoMemory());
        query.setParameter("builtCameraParam", entity.getBuiltCamera());
        query.setParameter("cameraPixelsParam", entity.getCameraPixels());
        query.setParameter("builtMicParam", entity.getBuiltMic());
        query.setParameter("builtSoundParam", entity.getBuiltSound());
        query.setParameter("numpadParam", entity.getNumpad());
        query.setParameter("keypboardIllumParam", entity.getKeypboardIllum());
        query.setParameter("cyrillicKeysParam", entity.getCyrillicKeys());
        query.setParameter("cursorControlParam", entity.getCursorControl());
        query.setParameter("fingerScannerParam", entity.getFingerScanner());
        query.setParameter("simCardParam", entity.getSimCard());
        query.setParameter("nfcParam", entity.getNfc());
        query.setParameter("btPram", entity.getBt());
        query.setParameter("lanParam", entity.getLan());
        query.setParameter("wifiParam", entity.getWifi());
        query.setParameter("countUsbParam", entity.getCountUsb());
        query.setParameter("usb20Param", entity.getUsb20());
        query.setParameter("usb30Param", entity.getUsb30());
        query.setParameter("usb31TypeaParam", entity.getUsb31Typea());
        query.setParameter("usb31TypecParam", entity.getUsb31Typec());
        query.setParameter("vgaParam", entity.getVga());
        query.setParameter("hdmiParam", entity.getHdmi());
        query.setParameter("displayportParam", entity.getDisplayport());
        query.setParameter("thunderboltParam", entity.getThunderbolt());
        query.setParameter("audioInParam", entity.getAudioIn());
        query.setParameter("countCellParam", entity.getCountCell());
        query.setParameter("energyReservParam", entity.getEnergyReserv());
        query.setParameter("osParam", entity.getOs());
        query.setParameter("deliverySet", entity.getDeliverySet());
        query.setParameter("priceParam", entity.getPrice());
        query.setParameter("vendorParam", entity.getVendor());
        query.setParameter("idParam", entity.getId());

        query.executeUpdate();


        session.getTransaction().commit();
        session.close();

    }

    public NotebookEntity getById(int id) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Query query = session.createQuery("from NotebookEntity where id = :paramName");
        query.setParameter("paramName", id);
        ArrayList<NotebookEntity> list = (ArrayList<NotebookEntity>) query.list();


        session.close();
        return list.get(0);


    }

    public ArrayList<NotebookEntity> getAll() {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        ArrayList<NotebookEntity> notebookList = (ArrayList<NotebookEntity>)  session.createQuery("From NotebookEntity ").list();
        session.close();
        return notebookList;

    }


    public ArrayList<NotebookEntity> find(String[] vendor, String processor, String[] year, String ram_from, String ram_to, String price_from, String price_to){
        Session session = HibernateSessionFactory.getSessionFactory().openSession();


        ArrayList<Integer> years = new ArrayList<Integer>();
        years.add(2017);
        years.add(2018);
        years.add(2019);



        ArrayList<String> processors = new ArrayList<String>();
        processors.add("Intel Core i3");
        processors.add("Intel Core i5");
        processors.add("Intel Core i7");
        processors.add("Intel Pentium");
        processors.add("Intel Celeron");

        ArrayList<String> vendors = new ArrayList<String>();
        vendors.add("Asus");
        vendors.add("Acer");
        vendors.add("Xiaomi");
        vendors.add("Apple");
        vendors.add("Lenovo");
        vendors.add("HP");

        Query query = session.createQuery("from NotebookEntity where capacityRam >= :paramRamFrom and capacityRam <= :paramRamTo and price>= :paramPriceFrom and price<= :paramPriceTo and processor in (:paramProcessor) and releaseDate in (:paramYear) and vendor in (:paramVendor)");

        //Query query = session.createQuery("from NotebookEntity where capacityRam >= :paramRamFrom and capacityRam <= :paramRamTo and price>= :paramPriceFrom and price<= :paramPriceTo and processor in (:paramProcessor)");


        if(ram_from.equals("")){
            query.setParameter("paramRamFrom", 0);
        } else {
            query.setParameter("paramRamFrom", Integer.parseInt(ram_from));
        }

        if(ram_to.equals("")){
            query.setParameter("paramRamTo", 1000);
        } else {
            query.setParameter("paramRamTo", Integer.parseInt(ram_to));

        }


        if(price_from.equals("")){
            query.setParameter("paramPriceFrom", 0);
        } else {
            query.setParameter("paramPriceFrom", Integer.parseInt(price_from));

        }

        if(price_to.equals("")){
            query.setParameter("paramPriceTo", 999999);
        } else {
            query.setParameter("paramPriceTo", Integer.parseInt(price_to));

        }


        if(processor.equals("не выбран")==true){
            query.setParameter("paramProcessor", processors);
        } else {
            query.setParameterList("paramProcessor", Collections.singleton(processor));
        }

        if(year==null) {
            query.setParameterList("paramYear", years);
        } else {
        ArrayList<Integer> yearList = new ArrayList<Integer>();
            for (String s : year) {
                yearList.add(Integer.parseInt(s));
            }
            query.setParameterList("paramYear", yearList);


        }

        if(vendor==null) {
            query.setParameterList("paramVendor", vendors);
        } else {

            query.setParameterList("paramVendor", vendor);


        }


        System.out.println(query.getQueryString());
        ArrayList<NotebookEntity> list = (ArrayList<NotebookEntity>) query.list();
        session.close();
        return list;


    }
}