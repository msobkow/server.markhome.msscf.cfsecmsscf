
// Description: Java 11 MssCF Iterator for SecUser Relationship TSecGrpMemb.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.sql.*;
import java.rmi.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.msscf.msscf.cfcore.CFGenKb.*;
import org.msscf.msscf.cfcore.CFGenKbObj.*;

/**
 *	CFSecMssCFIterateSecUserTSecGrpMemb binds SecUser.TSecGrpMemb
 *	as an instance of MssCFGenIteratorObj.
 */
public class CFSecMssCFIterateSecUserTSecGrpMemb
	extends MssCFGenIteratorObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFIterateSecUserTSecGrpMemb() {
		super();
	}

	public CFSecMssCFIterateSecUserTSecGrpMemb( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecUser",
			"TSecGrpMemb",
			"TSecGrpMemb" );
	}

	public ListIterator<ICFLibAnyObj> enumerateDetails( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFIterateSecUserTSecGrpMemb.enumerateDetails() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		List<ICFLibAnyObj> list = new LinkedList<ICFLibAnyObj>();

		if( genDef instanceof ICFSecSecUserObj ) {
			Iterator<ICFSecTSecGrpMembObj> elements = ((ICFSecSecUserObj)genDef).getOptionalChildrenTSecGrpMemb().iterator();
			while( elements.hasNext() ) {
				list.add( elements.next() );
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecUserObj" );
		}

		return( list.listIterator() );
	}}
