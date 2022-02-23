package com.api.controller;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.naming.spi.DirStateFactory.Result;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;

import com.api.utilitarios.SQLDatabaseConnection;

import com.api.ephyto.client.HubClient;

import _int.ippc.ephyto.HUB_Entities.Envelope;

public class Controlador  {
	
	public void procesarRecepcion() throws Exception {
	
	}
   
}
