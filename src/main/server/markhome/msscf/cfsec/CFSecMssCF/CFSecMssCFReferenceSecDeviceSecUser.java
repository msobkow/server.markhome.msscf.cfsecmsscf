
// Description: Java 11 MssCF Reference for SecDevice Relationship SecUser.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceSecDeviceSecUser binds SecDevice.SecUser
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceSecDeviceSecUser
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceSecDeviceSecUser() {
		super();
	}

	public CFSecMssCFReferenceSecDeviceSecUser( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"SecDevice",
			"SecUser",
			"SecUser" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceSecDeviceSecUser.dereference() ";

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

		ICFSecSecUserObj obj;

		if( genDef instanceof ICFSecSecDeviceObj ) {
			obj = (ICFSecSecUserObj)((ICFSecSecDeviceObj)genDef).getRequiredContainerSecUser();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecSecDeviceObj" );
		}

		return( obj );
	}
}
