// Subject Interface
interface Office {

    void accessOffice();

}

// Real Subject
class ManagerOffice implements Office {

    @Override
    public void accessOffice() {

        System.out.println("Access Granted. Welcome to the Manager's Office.");

    }

}

// Proxy Class
class SecurityGuard implements Office {

    private ManagerOffice managerOffice;
    private boolean authorized;

    public SecurityGuard(boolean authorized) {

        this.authorized = authorized;

    }

    @Override
    public void accessOffice() {

        if (authorized) {

            if (managerOffice == null) {

                managerOffice = new ManagerOffice();

            }

            managerOffice.accessOffice();

        } else {

            System.out.println("Access Denied! You are not authorized.");

        }

    }

}

// Main Class
public class ProxyPatternDemo {

    public static void main(String[] args) {

        System.out.println("Authorized User:");

        Office office1 = new SecurityGuard(true);

        office1.accessOffice();

        System.out.println("\nUnauthorized User:");

        Office office2 = new SecurityGuard(false);

        office2.accessOffice();

    }

}
