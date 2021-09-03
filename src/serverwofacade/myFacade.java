package serverwofacade;

public class myFacade {
    private static myFacade myFacadeObj = null;

    private myFacade() {
    }

    public static myFacade getMyServerWOFacade() {
        if (myFacadeObj == null) {
            myFacadeObj = new myFacade();
        }
        return myFacadeObj;
    }

    ScheduleServer scheduleServer = new ScheduleServer();

    public void startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
    }

    public void destoryServer() {
        scheduleServer.releaseProcesses();
        scheduleServer.destory();
        scheduleServer.destroySystemObjects();
        scheduleServer.destoryListeners();
        scheduleServer.destoryContext();
        scheduleServer.shutdown();
    }
}
