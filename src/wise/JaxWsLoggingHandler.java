package wise;

import org.apache.log4j.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.Set;

public class JaxWsLoggingHandler implements SOAPHandler<SOAPMessageContext> {
	private static final Logger logger = Logger.getLogger(JaxWsLoggingHandler.class);

	@Override
	public void close(MessageContext arg0) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		SOAPMessage message = arg0.getMessage();
		 ByteArrayOutputStream stream = new ByteArrayOutputStream();
		try {
			     message.writeTo(stream);
			System.out.println("Webservice Fault!");
			System.out.println(stream.toString("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext arg0) {
		SOAPMessage message = arg0.getMessage();
		boolean isOutboundMessage = (Boolean) arg0.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (isOutboundMessage) {
			System.out.println("OUTBOUND MESSAGE\n");

		} else {
			System.out.println("\nINBOUND MESSAGE\n");
		}
		try {
		       ByteArrayOutputStream stream = new ByteArrayOutputStream();
	            
	           // message.writeTo(System.out);
	            message.writeTo(stream);

			System.out.println(stream.toString("UTF-8"));
	            
	            stream.close();
	            
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
